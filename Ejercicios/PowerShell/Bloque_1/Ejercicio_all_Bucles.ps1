$cnt = 1
#Bucle for
Write-Host " ****** for ******"
for ($i = 1; $i -le 10; $i++){
    Write-Host "Valor - For: $i"
}
#Bucle While
Write-Host ""
Write-Host " ****** While ******"
While ($cnt -le 10){
    Write-Host "Valor - While: $cnt"
    $cnt++
}
#Bucle DoWhile
Write-Host ""
Write-Host " ****** do - While ******"
$cnt = 1
do {
    Write-Host "Ejecución número $cnt"
    $cnt++
} while ($cnt -le 10)
