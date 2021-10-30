FROM java:8  

COPY . /var/www/java  

WORKDIR ./src

ADD https://images.pexels.com/photos/4587959/pexels-photo-4587959.jpeg

RUN ./main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/Main.java

