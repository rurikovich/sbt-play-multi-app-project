Run configuretion.

тип: Sbt Task
Name: app1

Tasks:"project app1" run

Working directory: <путь до проекта>/sbt-multiproject-rootbuild

VM parameters: -Xms512M -Xmx1024M -Xss1M -XX:+CMSClassUnloadingEnabled -Dhttp.port=9005 -Dconfig.file=app1/conf/application1.conf

Важно переменные окружения пишем в VM parameters в виде -D<name>=<value>
