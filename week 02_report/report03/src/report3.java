void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int quantity;
    String place;

    System.out.print("당신의 이름은 ? : ");
    name = keyboard.nextLine();

    System.out.printf("%s님의 가족은 몇 명입니까 ? : ", name);
    quantity = keyboard.nextInt();
    keyboard.nextLine();

    System.out.printf("%s님의 가족은 어디에서 살지요 ? : ", name);
    place = keyboard.nextLine();

    System.out.printf("%s님의 가족은 %d명입니다.\n", name, quantity);
    System.out.printf("%s님의 가족은 %s에 살고있습니다.\n", name, place);
}