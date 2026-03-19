from libro import Libro
from database import Database

class Biblioteca:
    def __init__(self, db_path="ficheros/biblioteca.db"):
        self.db = Database(db_path)

    def agregar_libro(self, titulo, autor, anio, paginas, genero, isbn):
        # Verificar si ya existe el ISBN
        libros_existentes = self.db.fetchall("SELECT * FROM libros WHERE isbn = ?", (isbn,))

        if len(libros_existentes) > 0:
            print(f"❌ Error: Ya existe un libro con ISBN '{isbn}'.")
            print("   Título existente: {libros_existentes[0][1]}")
            return

        # Si no existe, añadir el libro
        self.db.ejecutar_query("""
                               INSERT INTO libros (titulo, autor, anio, paginas, genero, isbn)
                               VALUES (?, ?, ?, ?, ?, ?)
                               """, (titulo, autor, anio, paginas, genero, isbn))
        print("✅ Libro añadido correctamente a la base de datos.")

    def mostrar_libros(self):
        libros = self.db.fetchall("SELECT * FROM libros")
        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def buscar_libro(self, texto):
        libros = self.db.fetchall("""
            SELECT * FROM libros WHERE titulo LIKE ? OR autor LIKE ?
        """, (f'%{texto}%', f'%{texto}%'))
        if len(libros) == 0:
            print("No se encontraron libros.")
            return
        print("\nLibros encontrados:")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def buscar_por_isbn(self, isbn):
        libros = self.db.fetchall("SELECT * FROM libros WHERE isbn = ?", (isbn,))

        if len(libros) == 0:
            print(f"❌ No se encontró ningún libro con ISBN '{isbn}'.")
            return

        print(f"\n📖 Libro encontrado con ISBN '{isbn}':")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def eliminar_libro(self):
        self.mostrar_libros()
        try:
            id_libro = int(input("Introduce el ID del libro a eliminar: "))
            self.db.ejecutar_query("DELETE FROM libros WHERE id = ?", (id_libro,))
            print(f"✅ Libro con ID {id_libro} eliminado correctamente.")
        except ValueError:
            print("❌ Debes introducir un ID válido.")

    def libros_por_autor(self, autor_buscar):
        libros = self.db.fetchall("SELECT * FROM libros WHERE autor LIKE ?", (f'%{autor_buscar}%',))
        if len(libros) == 0:
            print(f"No se encontraron libros de '{autor_buscar}'.")
            return
        print(f"\nLibros de '{autor_buscar}':")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def libros_por_genero(self, genero_buscar):
        libros = self.db.fetchall("SELECT * FROM libros WHERE genero LIKE ?", (f'%{genero_buscar}%',))
        if len(libros) == 0:
            print(f"No se encontraron libros del género '{genero_buscar}'.")
            return
        print(f"\nLibros del género '{genero_buscar}':")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def libros_por_anio(self):
        libros = self.db.fetchall("SELECT * FROM libros ORDER BY anio ASC")
        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return
        print("\nLibros ordenados por año (más antiguo → más reciente):")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def libros_por_paginas(self):
        libros = self.db.fetchall("SELECT * FROM libros ORDER BY paginas ASC")
        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return
        print("\nLibros ordenados por páginas (menos → más páginas):")
        for libro_data in libros:
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def top3_libros_paginas(self):
        libros = self.db.fetchall("SELECT * FROM libros ORDER BY paginas DESC LIMIT 3")
        if len(libros) == 0:
            print("No hay libros en la biblioteca.")
            return
        print("\n🏆 TOP 3 LIBROS CON MÁS PÁGINAS 🏆")
        for i, libro_data in enumerate(libros, 1):
            print(f"\n🥈 #{i} - ", end="")
            libro = Libro(*libro_data)
            libro.mostrar_info()

    def estadisticas(self):
        libros = self.db.fetchall("SELECT COUNT(*), MAX(paginas), MIN(paginas) FROM libros")
        total_libros, max_pag, min_pag = libros[0]

        if total_libros == 0:
            print("No hay libros en la biblioteca.")
            return

        libro_max = self.db.fetchall("SELECT * FROM libros ORDER BY paginas DESC LIMIT 1")[0]
        libro_min = self.db.fetchall("SELECT * FROM libros ORDER BY paginas ASC LIMIT 1")[0]

        print("\n--- ESTADÍSTICAS ---")
        print(f"Total de libros: {total_libros}")
        print(f"Libro más largo: {Libro(*libro_max).titulo} ({libro_max[4]} páginas)")
        print(f"Libro más corto: {Libro(*libro_min).titulo} ({libro_min[4]} páginas)")
        print("-" * 30)
