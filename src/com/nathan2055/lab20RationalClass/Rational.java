package com.nathan2055.lab20RationalClass;

/**
 * A class that represents a rational number.
 */

public class Rational {
    private int numerator;
    private int denominator;

    /**
     * The default constructor for objects of class Rational.  Creates the rational number 1.
     */
    public Rational() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * The alternate constructor for objects of class Rational.  Creates a rational number equivalent to n/d.
     *
     * @param n The numerator of the rational number.
     * @param d The denominator of the rational number.
     */
    public Rational(int n, int d) {
        if (d == 0) {
            throw new ZeroDenominatorException("The denominator of a rational number cannot be zero.");
        } else {
            numerator = n;
            denominator = d;
            normalize();
        }
    }

    /**
     * Get the value of the Numerator
     *
     * @return the value of the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Get the value of the Denominator
     *
     * @return the value of the denominator
     */
    public int getDenominator() {
        return denominator;
    }


    /**
     * Negate a rational number r
     *
     * @return a new rational number that is negation of this number -r
     */
    public Rational negate() {
        int newNumerator = numerator * -1;
        return new Rational(newNumerator, denominator);
    }

    /**
     * Invert a rational number r
     *
     * @return a new rational number that is 1/r.
     */
    public Rational invert() {
        Rational c = new Rational();
        return c.divide(this);
    }

    /**
     * Add two rational numbers
     *
     * @param other the second argument of the add
     * @return a new rational number that is the sum of this and the other rational
     */
    public Rational add(Rational other) {
        int numerator2 = other.getNumerator();
        int denominator2 = other.getDenominator();

        int newNumerator = ((numerator * denominator2) + (numerator2 * denominator));
        int newDenominator = (denominator * denominator2);

        return new Rational(newNumerator, newDenominator);
    }

    /**
     * Subtract a rational number t from this one r
     *
     * @param other the second argument of subtract
     * @return a new rational number that is r-t
     */
    public Rational subtract(Rational other) {
        other = other.negate();

        int numerator2 = other.getNumerator();
        int denominator2 = other.getDenominator();

        int newNumerator = ((numerator * denominator2) + (numerator2 * denominator));
        int newDenominator = (denominator * denominator2);

        return new Rational(newNumerator, newDenominator);
    }

    /**
     * Multiply two rational numbers
     *
     * @param other the second argument of multiply
     * @return a new rational number that is the sum of this object and the other rational.
     */
    public Rational multiply(Rational other) {
        int numerator2 = other.getNumerator();
        int denominator2 = other.getDenominator();

        int newNumerator = (numerator * numerator2);
        int newDenominator = (denominator * denominator2);

        return new Rational(newNumerator, newDenominator);
    }


    /**
     * Divide this rational number r by another one t
     *
     * @param other the second argument of divide
     * @return a new rational number that is r/t
     */
    public Rational divide(Rational other) {
        int numerator2 = other.getNumerator();
        int denominator2 = other.getDenominator();

        int newNumerator = (numerator * denominator2);
        int newDenominator = (denominator * numerator2);

        return new Rational(newNumerator, newDenominator);
    }


    /**
     * Put the rational number in normal form where the numerator
     * and the denominator share no common factors.  Guarantee that only the numerator
     * is negative.
     */
    private void normalize() {
        // Check if either or both numbers are negative
        boolean isNegative = false;
        if (numerator < 0 || denominator < 0) {
            isNegative = true;
        }
        if (numerator < 0 && denominator < 0) {
            isNegative = false;
        }

        // Make both numbers positive
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        // Simplify
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // Make numerator negative if necessary
        if (isNegative) {
            numerator = numerator * -1;
        }
    }

    /**
     * Recursively compute the greatest common divisor of two positive integers
     *
     * @param a the first argument of gcd
     * @param b the second argument of gcd
     * @return the gcd of the two arguments
     */
    private int gcd(int a, int b) {
        int result = 0;
        if (a < b)
            result = gcd(b, a);
        else if (b == 0)
            result = a;
        else {
            int remainder = a % b;
            result = gcd(b, remainder);
        }
        return result;
    }


}
