@echo off
set NUM=0 1 2 3 4 5 6 7 8 9 A B C D E F
    for %%y in (%NUM%) do (
        color 0%%y
        timeout 1 >nul
    )
