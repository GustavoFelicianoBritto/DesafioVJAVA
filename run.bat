@echo off
title Executar Projeto DesafioVJAVA
color 0A

:: 1. Compilar o código
echo Compilando...
javac -d bin -encoding UTF-8 src/DesafioVJAVA/*.java

:: 2. Verificar se a compilação deu certo
if errorlevel 1 (
    echo Erro na compilação! Verifique o código.
    pause
    exit
)

:: 3. Executar o programa
echo Executando...
java -cp bin DesafioVJAVA.Main

:: 4. Manter o CMD aberto após execução
pause