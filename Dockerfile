# Sử dụng image OpenJDK 17
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file JAR của ứng dụng vào container
COPY target/school-0.0.1-SNAPSHOT.jar school-management.jar

# Expose port 8080
EXPOSE 8080

# Command để chạy ứng dụng
ENTRYPOINT ["java", "-jar", "school-management.jar"]
