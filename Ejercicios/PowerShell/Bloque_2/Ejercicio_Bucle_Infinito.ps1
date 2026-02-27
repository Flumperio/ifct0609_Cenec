#Ver procesos
#Arrancar Procesos
$cnt = 0
while ($cnt -le 1){
Start-Process open -ArgumentList "-n -a Calculator"
}
