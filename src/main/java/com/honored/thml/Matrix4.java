package com.honored.thml;

public class Matrix4 {

    // defaulting to 0.0f
    private float m00, m01, m02, m03;
    private float m10, m11, m12, m13;
    private float m20, m21, m22, m23;
    private float m30, m31, m32, m33;

    //Defaults to identity matrix
    public Matrix4(){
        m00 = 1;
        m11 = 1;
        m22 = 1;
        m33 = 1;
    }


    // Vector x Matrix
    public Vector4 multiply(Vector4 v) {

        float x = m00 * v.getX() + m01 * v.getY() + m02 * v.getZ() + m03 * v.getW();

        float y = m10 * v.getX() + m11 * v.getY() + m12 * v.getZ() + m13 * v.getW();

        float z = m20 * v.getX() + m21 * v.getY() + m22 * v.getZ() + m23 * v.getW();

        float w = m30 * v.getX() + m31 * v.getY() + m32 * v.getZ() + m33 * v.getW();

        return new Vector4(x, y, z, w);
    }


    // Matrix x Matrix
    public Matrix4 multiply(Matrix4 other) {
        Matrix4 product = new Matrix4();

        product.m00 =
                  this.m00 * other.m00
                + this.m01 * other.m10
                + this.m02 * other.m20
                + this.m03 * other.m30;

        product.m01 =
                this.m00 * other.m01
                        + this.m01 * other.m11
                        + this.m02 * other.m21
                        + this.m03 * other.m31;
        product.m02 =
                this.m00 * other.m02
                        + this.m01 * other.m12
                        + this.m02 * other.m22
                        + this.m03 * other.m32;

        product.m03 =
                this.m00 * other.m03
                        + this.m01 * other.m13
                        + this.m02 * other.m23
                        + this.m03 * other.m33;

        product.m10 =
                this.m10 * other.m00
                        + this.m11 * other.m10
                        + this.m12 * other.m20
                        + this.m13 * other.m30;

        product.m11 =
                this.m10 * other.m01
                        + this.m11 * other.m11
                        + this.m12 * other.m21
                        + this.m13 * other.m31;

        product.m12 =
                this.m10 * other.m02
                        + this.m11 * other.m12
                        + this.m12 * other.m22
                        + this.m13 * other.m32;

        product.m13 =
                this.m10 * other.m03
                        + this.m11 * other.m13
                        + this.m12 * other.m23
                        + this.m13 * other.m33;


        product.m20 =
                this.m20 * other.m00
                        + this.m21 * other.m10
                        + this.m22 * other.m20
                        + this.m23 * other.m30;

        product.m21 =
                this.m20 * other.m01
                        + this.m21 * other.m11
                        + this.m22 * other.m21
                        + this.m23 * other.m31;

        product.m22 =
                this.m20 * other.m02
                        + this.m21 * other.m12
                        + this.m22 * other.m22
                        + this.m23 * other.m32;

        product.m23 =
                this.m20 * other.m03
                        + this.m21 * other.m13
                        + this.m22 * other.m23
                        + this.m23 * other.m33;


        product.m30 =
                this.m30 * other.m00
                        + this.m31 * other.m10
                        + this.m32 * other.m20
                        + this.m33 * other.m30;

        product.m31 =
                this.m30 * other.m01
                        + this.m31 * other.m11
                        + this.m32 * other.m21
                        + this.m33 * other.m31;

        product.m32 =
                this.m30 * other.m02
                        + this.m31 * other.m12
                        + this.m32 * other.m22
                        + this.m33 * other.m32;

        product.m33 =
                this.m30 * other.m03
                        + this.m31 * other.m13
                        + this.m32 * other.m23
                        + this.m33 * other.m33;

        return product;

    }


    public void scale(float x, float y, float z) {
        this.m00 = x;
        this.m11 = y;
        this.m22 = z;
    }

    public void translate(float x, float y, float z) {
        this.m03 = x;
        this.m13 = y;
        this.m23 = z;
    }


    public void rotateZ(float degrees){
        double radians = Math.toRadians(degrees);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);

        this.m00 = cos;
        this.m01 = -sin;
        this.m10 = sin;
        this.m11 = cos;
    }




    // Getters and Setters
    public float getM00() {
        return m00;
    }

    public void setM00(float m00) {
        this.m00 = m00;
    }

    public float getM01() {
        return m01;
    }

    public void setM01(float m01) {
        this.m01 = m01;
    }

    public float getM02() {
        return m02;
    }

    public void setM02(float m02) {
        this.m02 = m02;
    }

    public float getM03() {
        return m03;
    }

    public void setM03(float m03) {
        this.m03 = m03;
    }

    public float getM10() {
        return m10;
    }

    public void setM10(float m10) {
        this.m10 = m10;
    }

    public float getM11() {
        return m11;
    }

    public void setM11(float m11) {
        this.m11 = m11;
    }

    public float getM12() {
        return m12;
    }

    public void setM12(float m12) {
        this.m12 = m12;
    }

    public float getM13() {
        return m13;
    }

    public void setM13(float m13) {
        this.m13 = m13;
    }

    public float getM20() {
        return m20;
    }

    public void setM20(float m20) {
        this.m20 = m20;
    }

    public float getM21() {
        return m21;
    }

    public void setM21(float m21) {
        this.m21 = m21;
    }

    public float getM22() {
        return m22;
    }

    public void setM22(float m22) {
        this.m22 = m22;
    }

    public float getM23() {
        return m23;
    }

    public void setM23(float m23) {
        this.m23 = m23;
    }

    public float getM30() {
        return m30;
    }

    public void setM30(float m30) {
        this.m30 = m30;
    }

    public float getM31() {
        return m31;
    }

    public void setM31(float m31) {
        this.m31 = m31;
    }

    public float getM32() {
        return m32;
    }

    public void setM32(float m32) {
        this.m32 = m32;
    }

    public float getM33() {
        return m33;
    }

    public void setM33(float m33) {
        this.m33 = m33;
    }
}
