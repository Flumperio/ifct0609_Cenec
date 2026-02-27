# Crear Carpeta y Archivo.
$trabajo = "/Users/jcsantos/Documents/ifct0609/Ejercicios/PowerShell/Bloque_2/"
$direc = Read-Host "Dame el nombre del directorio"
$nomFich = Read-Host "Dame el nombre del fichero"
New-Item -Path $trabajo$direc -ItemType Directory
New-Item -Path $trabajo$direc/$nomFich.txt -ItemType File
##Creamos varios archivos
for ($cnt = 1; $cnt -le 5; $cnt++){
New-Item -Path $trabajo$direc/$nomFich-$cnt.txt -ItemType File
}
Write-Host ""
Write-Host " ***** Directorio *****"
Get-ChildItem $trabajo
$dirCP = Read-Host "Dame el directorio"
Get-ChildItem $trabajo$dirCP
$cpFich = Read-Host "Dame el nombre del fichero a copiar: "
Copy-Item -Path $trabajo$dirCP/$cpFich -Destination $trabajo$dirCP/$cpFich.BACKUP
$mvFich = Read-Host "Dame el nombre del fichero a mover: "
Move-Item -Path $trabajo$dirCP/$mvFich -Destination $trabajo$dirCP/$cpFich.MOVE
Get-ChildItem $trabajo$dirCP

$cnt = "s"
while ($cnt -eq "s"){
Write-Host ""
Write-Host " Directorios Raiz"
Get-ChildItem $trabajo
$delDir = Read-Host "Dame el directorio a borrar"
Remove-Item -Path $trabajo$delDir -Force
$cnt = Read-Host "Otro directorio (s/n)"
}
