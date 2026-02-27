#Ver procesos
Get-Process
#Arrancar Procesos
Start-Process open -ArgumentList "-a Calculator"
#Ver el proceso de la calculadora
sleep 2
Write-Host " ****** ID Calculadora ***** "
Get-Process Calculator | Select-Object Name, Id, CPU
$id = (Get-Process Calculator).Id
Write-Host " ***** Solo ID ***** "
Write-Host "ID: $id"
#Matar el proceso de la calculadora
Stop-Process $id

Get-Process | Out-File -FilePath procesos.txt
