$nombre = Read-Host "¿Cualo es tuo nombre?"
[int]$edad = Read-Host "¿Cual es tu edad?"
Write-Host "Bienvenido, $nombre"
if ($edad -ge 18) {
    Write-Host "Eres mayor de edad"
} else {
    Write-Host "Eres un inverbe"
}
