import sqlite3

class Database:
    def __init__(self, db_path="ficheros/biblioteca.db"):
        self.db_path = db_path
        self.crear_tabla()

    def crear_tabla(self):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
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
        conexion.commit()
        conexion.close()

    def ejecutar_query(self, query, params=None):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        if params:
            cursor.execute(query, params)
        else:
            cursor.execute(query)
        conexion.commit()
        conexion.close()

    def fetchall(self, query, params=None):
        conexion = sqlite3.connect(self.db_path)
        cursor = conexion.cursor()
        if params:
            cursor.execute(query, params)
        else:
            cursor.execute(query)
        resultados = cursor.fetchall()
        conexion.close()
        return resultados
