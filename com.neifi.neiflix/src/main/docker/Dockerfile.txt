FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD com.neifi.jar /opt/com.neifi/
EXPOSE 8080
WORKDIR /opt/com.neifi/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "com.neifi.jar"]
