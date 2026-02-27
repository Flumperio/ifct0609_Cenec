$asignatura = Read-Host "Asignatura: "
[int]$nota = Read-Host "Nota: "
if ($nota -ge 5) {
    Write-Host "Has aprobado " -NoNewline
} else {
    Write-Host "Has suspendido " -NoNewline
}
Write-Host "$asignatura"
