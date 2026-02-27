[int]$isok = 0

function PingJC {
    param ($ip)
    $output = ping -c 1 -W 3 $ip  # -W 3 = timeout 3s
    if ($LASTEXITCODE -eq 0) {
        return 1  # Ping OK
    } else {
        return 0  # No ping
    }
}
$ip = Read-Host "Dame la dirección IP"
$isok = PingJC $ip

if ($isok -eq 1) {
    Write-Host "La IP tiene chicha" -ForegroundColor Green
} else {
    Write-Host "La IP no tiene na" -ForegroundColor Red
}
