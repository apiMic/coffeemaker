Opis zadania implemetowanego w tym projekcie


Załóż konto na github.com i utwóż tam nowe publiczne repozytorium.
Sklonuj repozytorium na swojego kompa i utwórz tam nowy java project a następnie zrób pusha pustego projektu. Potem możesz przejść do implementacji aplikacji opisanej poniżej.
Staraj się commitowac i pushowac to co napisałeś danego dnia żeby weszło Ci to w nawyk i ułatwiło ewentualne wycofanie zmian jeśli zaliczysz fuck up’a.
Zanim zabierzesz się do kodowania przeczytaj instrukcje i z grubsza zaplanuj swoją pracę tak żeby podejść do problemu z obiektowego punktu widzenia. Rozbij problem na mniejsze i implementuj wszystko małymi kroczkami, a jeśli skończysz jakąś wydzielaną przez siebie funkcjonalność rób commita.
Powodzenia

Ps. Pamiętaj żeby kod był po angielsku!!!

Napisz aplikację konsolową “Coffee maker”.
Aplikacja będzie przyjmowała input użytkownika jako string. Input powinien byc “case insensitive”
Automat posiada następujące składniki:
Coffee - max 2000 g
Water - max 1500 ml
Milk - max 1000 ml
Przy uruchomieniu programu wartości składników są losowo ustawiane jako wartość z przedziału 0 - max

Po wpisaniu:
Hello - odpowiedz to Hi
Status - wyświetlane jest ile procent każdego ze składników pozostało w maszynie
Make coffee - automat rozpoczyna robienie kawy według przepisu nr 1
Make white coffee - automat rozpoczyna robienie kawy według przepisu nr 2
Refill <nazwa skladnika> - uzupełnia maksymalnie 500 jednostek danego składnika
Exit - automat wyświetla “Bye” i kończy program

Jesli ilosc któregoś ze skladnikow nie jest wystarczajaca aby wykonac dany przepis automat powinien wyświetlić informacje o tym jakiego składnika brakuje.

Przepis 1:
- automat wyświetla przez 5 sekund napis “Grinding…” i zużywa 11g kawy
- automat wyświetla przez 3 sekundy napis “Heating water...”
- automat wyświetla przez 3 sekundy napis “Pouring water...” i zużywa 170ml wody
- automat wyświetla przez 3 sekundy napis “Pouring water...” i zużywa 30ml wody

Przepis 2:
- automat wyświetla przez 5 sekund napis “Grinding…” i zużywa 11g kawy
- automat wyświetla przez 3 sekundy napis “Heating water...”
- automat wyświetla przez 3 sekundy napis “Pouring water...” i zużywa 170ml wody
- automat wyświetla przez 3 sekundy napis “Pouring water...” i zużywa 30ml wody
- automat wyświetla przez 3 sekundy napis “Pouring milk...” i zużywa 50ml mleka

Zadanie z gwiazdką
Automat przestaje robić kawę po naciśnięciu “q”
