# Как использовать?

Для начала вам нужно создать бота в вк. Для этого переходите в группы, создать сообщество, далее выбираете любую тематику и любое название, кликаем создать.

В строке поиска копируем id нашей группы и запоминаем (это будет наш groupId).

В созданной группе переходим в настройки, "Работа с API", далее заходим в "Long Poll API"; 
В настройках включаем и выбираем версию 5.131, затем здесь же переходим в "Типы событий" и выделяем галочками "Входящее сообщение" и "Исходящее сообщение".
Далее идём в "Ключи доступа" и кликаем на "Создать ключ" (выбираем все пункты из выпадающего списка и кликаем создать) - это наш accessToken.

Далее Идём в настройки сообщений и включаем "Сообщения сообщества"

Теперь, когда мы знаем groupId и accessToken используем их на 2-ой и 3-ей строчке кода соответственно.
