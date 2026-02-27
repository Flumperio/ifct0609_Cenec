#Test-connection igual que ping
Test-Connection google.com -Count 4
# Test para ver los puertos
Test-NetConnection -ComputerName google.com
