# Как использовать?
_

Для начала вам необходимо создать бота в ВК: переходим в «Группы», «Создать сообщество», далее выбираем любую тематику и название, следом кликаем «Создать».

В строке поиска копируем id новой группы и запоминаем – это будет наш groupId.

В созданной группе переходим в настройки, а именно
«Работа с API», далее «Long Poll API». В настройках включаем и выбираем версию 5.131, затем здесь же переходим в «Типы событий» и выделяем галочками «Входящее сообщение» и «Исходящее сообщение».

В «Ключах доступа» кликаем на «Создать ключ» (необходимо выбрать все пункты из выпадающего списка и кликнуть «Создать)- это наш accessToken.

Далее переходим в настройки сообщений и включаем «Сообщения сообщества».

Теперь, когда мы знаем groupId и accessToken, используем их на 2-ой и 3-ей строчке кода. 

Чтобы бот заработал, остаётся только запустить приложение в вашей IDE.
