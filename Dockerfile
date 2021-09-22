FROM openjdk:11

EXPOSE 8080

RUN mkdir /app

COPY Jars/testchrome.jar /app/testchrome.jar

CMD java -cp app/testchrome.jar com.test.chrome.GoogleTestChromeMain