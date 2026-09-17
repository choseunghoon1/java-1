void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius; // 원의 반지름

    double diameter;
    double 정사각형의면적;
    double 원의면적;
    double 구하는면적;

    System.out.print("원의반지름 입력 : ");
    radius = keyboard.nextInt();
    diameter = radius * 2;
    정사각형의면적 = diameter * diameter;
    원의면적 = 3.141592 * radius * radius;
    구하는면적 = 정사각형의면적 - 원의면적;

    System.out.printf("원의 반지름 : %,d\n", radius);
    System.out.printf("정사각형 면적 : %,f cm2\n", 정사각형의면적);
    System.out.printf("원의 면적 : %,f cm2\n", 원의면적);
    System.out.printf("구하는 면적 : %,f cm2\n", 구하는면적);
}