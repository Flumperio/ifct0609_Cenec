#Ejercicio 21. Crear una base de datos de alumnos
#Con sqlite3, crea una base de datos llamada academia.db y una tabla alumnos con id, nombre, edad y nota.
#Importamos libreria SQLite
import sqlite3

conexion = sqlite3.connect("/Users/jcsantos/Desktop/academia.db")
cursor = conexion.cursor()

cursor.execute("""
CREATE TABLE IF NOT EXISTS alumnos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    edad INTEGER,
    nota REAL)
""")
alumnos = [
    ("Ana", 20, 8.5),
    ("Luis", 22, 7.0),
    ("Marta", 19, 9.2),
    ("Pablo", 21, 6.8),
    ("Sara", 23, 8.9),]

cursor.executemany("INSERT INTO alumnos (nombre, edad, nota) VALUES (?, ?, ?)", alumnos)
conexion.commit()
conexion.close()