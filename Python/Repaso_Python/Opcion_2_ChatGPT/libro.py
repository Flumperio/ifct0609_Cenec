class Libro:
    def __init__(self, id, titulo, autor, anio, paginas, genero=None, isbn=None):
        self.id = id
        self.titulo = titulo
        self.autor = autor
        self.anio = anio
        self.paginas = paginas
        self.genero = genero
        self.isbn = isbn

    def mostrar_info(self):
        print(f"\n--- Libro ID:{self.id} ---")
        print(f"Título: {self.titulo}")
        print(f"Autor: {self.autor}")
        print(f"Año: {self.anio}")
        print(f"Páginas: {self.paginas}")
        if self.genero:
            print(f"Género: {self.genero}")
        if self.isbn:
            print(f"ISBN: {self.isbn}")
        print("-" * 30)
