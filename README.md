# SeleniumJavaFramework
AUTOMATYZACJA TESTÓW APLIKACJI WEBOWEJ W JAVA Z WYKORZYSTANIEM BIBLIOTEKI WEBDRIVER
Testowana strona http://sampleapp.tricentis.com/101/

Celem projektu jest przetestowanie formularza do
wykupienia ubezpieczenia motoru, działania pola wyszukiwania oraz
sprawdzenie poprawności hiperłączy. Wtym celu opracowano 7
przypadków testowych:
TC1: Poprawne uzupełnienie formularza do kupna ubezpieczenia
motoru
TC2: Niepoprawne uzupełnienie uzupełnienia formularza do kupna
ubezpieczenia motoru – podana niepoprawna pojemność silnika
TC3: Niepoprawne uzupełnienie uzupełnienia formularza do kupna
ubezpieczenia motoru – podana niepoprawna moc silnika
TC4: Sprawdzenie poprawności zawartości listy rozwijanej
TC5: Sprawdzenie ilości hiperłączy na stronie głównej
TC6: Sprawdzenie poprawności wyświetlenia się hiperłączy na stronie
głównej
TC7: Sprawdzenie poprawności działania pola wyszukiwania na
stronie głównej
W niniejszej pracy zastosowano wzorzec projektowy Page Object,
podejście Page Factory oraz testowanie oparte na danych – pobieranie
danych z pliku Excel.

Projekt frameworka został napisany w edytorze Eclipse, z
wykorzystaniem biblioteki Selenium w wersji 4.1.3, w Windows 10.
Testy zostały napisane z wykorzystaniem biblioteki TestNG. W pliku
config.properties są zawarte dane konfiguracyjne frameworka.
Framework jest przystosowany na obsługę Chrome, Firefox, Internet
Explorer. Projekt korzysta z DriverManagera. Domyślna przeglądarka
to Chrome. Została we frameworku zastosowana biblioteka Extent
reports , dzięki której możemy wygenerować raport w pliku html. W
katalogu testData znajduje się plik z danymi z roszerzeniem xlsx. Do
odczytu pliku w formacie pliku Excel wykorzystano bibliotekę Apache
POI. Sterowanie testami jest za pomocą pliku testng.xml. Zależności,
używane pluginy są w pliku pom.xml. 
