public class BasicJavaTest {
    public static void main(String[] args) {
    BasicJava testNumber = new BasicJava();

    testNumber.print1To255();

    testNumber.printOdd1To255();

    testNumber.printSum();

    int[] testArr = {-9,-7,-5,-3,-1,0,1,3,5,7,9};
    testNumber.iterateArray(testArr);

    testNumber.intMax(testArr);

    testNumber.getAverage(testArr);

    testNumber.arrayOddNumbers();


    testNumber.greaterThanY(testArr, 3);


    testNumber.squareTheValues(testArr);


    testNumber.eliminateNegativeNumbers(testArr);


    testNumber.maxMinAvg(testArr);

    testNumber.shiftingValues(testArr);
    }
}