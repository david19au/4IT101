@author Trong Dat Luu
@version 1.0
Vytvořeno pro kurz 4IT101 v LS 2021/22.

Jednoduchá textová hra, která se jmenuje "Zapomnění."
Hráč ovládá postavu, která se trápí s psychickými problémy a pocity bezcennosti.
Začíná se v prostorech domova postavy, ze které se hráč může pohybovat do různých prostorů a sbírat některé věci.
Hra nemá jasně daný cíl, je čistě na hráči, co s postavou udělá.
Cíle si jakoby hráč sestavuje sám - chce-li zabít postavu, může to udělat, chce-li postavu zachránit, může to také udělat.

Hra je napsaná v Javě, na spuštění je potřeba mít nainstalovanou verzi Java 8 a výš.
Hra se na Windows systémech dá spustit pomocí souboru "WindowsStart.bat".

Na macOS a UNIX systémech může být hra spuštěna pomocí souboru "macOSStart.command".
Může se stát, že bude potřeba přiřadit souboru oprávnění pro spuštění, to uděláte přes terminál, kde napíšete "chmod +x " a přetáhnete soubor.
Bohužel na macOS může stále být problém se spuštěním, jelikož Apple Quarantine může označit soubor za podezřelý a ani po nastavení "chmod +x" nepůjde soubor spustit.
V tomto případě napište do terminálu "java -jar " a přetáhněte .jar soubor ze složky "/out/artifacts/AdventuraZapomneni_jar/".
Hra lze samozřejmě spustit manuálně navigováním konzole/terminálu do složky "/out/artifacts/AdventuraZapomneni_jar/" a zadáním příkazu "java -jar AdventuraZapomneni.jar".
