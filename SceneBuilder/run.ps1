clear

$binCount = ls | ? { $_.Name -eq "bin"} | measure | % { $_.Count}
if ($binCount -eq "0")
{
    "Criando pasta bin..."
    mkdir bin
}

ls | ? { $_.Name.EndsWith(".fxml") } | % { cp $_.Name .\bin\ }

ls | ? { $_.Name.Contains("Controller") } | % { javac -d bin $_.Name}

javac App.java -d bin
cd bin 
java App 
cd ..