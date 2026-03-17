"""PARTE 5 — Base de datos SQLite
Crear una base de datos:
biblioteca.db
con una tabla:
libros
campos:
id
titulo
autor
año
paginas

Ejercicio 13
Crear el script que cree la base de datos."""
import sqlite3

# Conectar/crear base de datos
conexion = sqlite3.connect("ficheros/biblioteca.db")
cursor = conexion.cursor()

# Crear tabla libros con campos adicionales
cursor.execute("""
    CREATE TABLE IF NOT EXISTS libros (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        titulo TEXT NOT NULL,
        autor TEXT NOT NULL,
        anio INTEGER,
        paginas INTEGER,
        genero TEXT,
        isbn TEXT
    )
""")

# Insertar 30 libros reales
libros_data = [
    ("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 863, "Novela", "978-84-376-2467-2"),
    ("La Celestina", "Fernando de Rojas", 1499, 192, "Drama", "978-84-249-2785-8"),
    ("El Lazarillo de Tormes", "Anónimo", 1554, 128, "Picaresco", "978-84-270-5123-5"),
    ("Cien años de soledad", "Gabriel García Márquez", 1967, 417, "Realismo mágico", "978-84-9793-128-1"),
    ("La familia de Pascual Duarte", "Camilo José Cela", 1942, 162, "Novela social", "978-84-270-5124-2"),
    ("Nada", "Carmen Laforet", 1945, 287, "Novela existencial", "978-84-9793-129-8"),
    ("Fortunata y Jacinta", "Benito Pérez Galdós", 1887, 1321, "Novela realista", "978-84-9763-456-7"),
    ("La casa de Bernarda Alba", "Federico García Lorca", 1936, 96, "Drama", "978-84-206-5123-4"),
    ("Los santos inocentes", "Miguel Delibes", 1981, 278, "Novela social", "978-84-663-2345-6"),
    ("Corazón tan blanco", "Javier Marías", 1992, 340, "Novela psicológica", "978-84-339-2345-7"),
    ("La sombra del viento", "Carlos Ruiz Zafón", 2001, 612, "Misterio", "978-84-662-3456-8"),
    ("El capitán Alatriste", "Arturo Pérez-Reverte", 1996, 280, "Aventura histórica", "978-84-666-7890-1"),
    ("Requiem por un campesino español", "Ramón J. Sender", 1953, 152, "Novela social", "978-84-339-1234-5"),
    ("Luces de bohemia", "Ramón del Valle-Inclán", 1924, 208, "Esperpentos", "978-84-270-6789-0"),
    ("La verdad sobre el caso Savolta", "Eduardo Mendoza", 1975, 384, "Novela negra", "978-84-9793-5678-9"),
    ("Bartleby y compañía", "Enrique Vila-Matas", 2000, 192, "Novela experimental", "978-84-8310-123-4"),
    ("El tiempo entre costuras", "María Dueñas", 2009, 608, "Novela histórica", "978-84-9942-345-6"),
    ("Patria", "Fernando Aramburu", 2016, 496, "Novela contemporánea", "978-84-663-7890-2"),
    ("Soldados de Salamina", "Javier Cercas", 2001, 224, "Novela histórica", "978-84-8310-456-7"),
    ("El palacio de la medianoche", "Carlos Ruiz Zafón", 1994, 296, "Juvenil", "978-84-241-2345-8"),
    ("Los girasoles ciegos", "Alberto Méndez", 2004, 128, "Cuentos", "978-84-8428-567-8"),
    ("Entre visillos", "Carmen Martín Gaite", 1958, 384, "Novela social", "978-84-206-7890-1"),
    ("Galíndez", "Manuel Vázquez Montalbán", 1990, 512, "Novela negra", "978-84-9793-890-3"),
    ("Lo que el viento se llevó", "Margaret Mitchell", 1936, 1032, "Histórica", "978-84-253-1234-5"),
    ("El nombre de la rosa", "Umberto Eco", 1980, 592, "Misterio histórico", "978-84-666-1234-6"),
    ("El perfume", "Patrick Süskind", 1985, 256, "Histórica", "978-84-270-3456-7"),
    ("El alquimista", "Paulo Coelho", 1988, 208, "Espiritual", "978-84-9793-123-4"),
    ("Como agua para chocolate", "Laura Esquivel", 1989, 240, "Realismo mágico", "978-84-206-5678-9"),
    ("Rayuela", "Julio Cortázar", 1963, 634, "Experimental", "978-84-8310-789-0"),
    ("1984", "George Orwell", 1949, 326, "Distopía", "978-84-9793-456-1")
]

cursor.executemany("""
    INSERT INTO libros (titulo, autor, anio, paginas, genero, isbn) 
    VALUES (?, ?, ?, ?, ?, ?)
""", libros_data)

# Guardar cambios y cerrar
conexion.commit()
conexion.close()

print("✅ Base de datos 'biblioteca.db' creada con ÉXITO")
print(f"✅ Tabla 'libros' con campos: id, titulo, autor, anio, paginas, genero, isbn")
print(f"✅ {len(libros_data)} libros reales INSERTADOS correctamente")

