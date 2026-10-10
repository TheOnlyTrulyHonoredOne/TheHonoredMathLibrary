# The Honored Math Library

This is a small Java mathematics library intended to aid in calculations for rendering in 3D space.

## Features
- Vector4 Class:
  - multiplication
- Matrix4 Class:
  - Multiplication
  - Translation
  - Scaling
  - Z-axis rotation

## Syntax Documentation
```java
Matrix4 scale = new Matrix4();
scale.scale(2, 2, 2);

Matrix4 rotation = new Matrix4();
rotation.rotateZ(90);

Vector4 vector = new Vector4(1, 0, 0, 1);

Matrix4 combined = rotation.multiply(scale);

Vector4 result = combined.multiply(vector);

System.out.println(result);
```

## Building

This project is built with Gradle.

- BASH --> ./gradlew build

- WINDOWS --> gradlew.bat build

## License

This project is for learning and experimentation.
