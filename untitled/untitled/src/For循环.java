public class For循环 {
    /*if，switch语句可以用与多项

    public static void main(String[] args) {
        int x;
        System.out.println("请输入生日");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x >= 1 && x < 2) {
            System.out.println("a");
        } else {
            if (x >= 2 && x < 3) {
                System.out.println("b");
            } else {
                if (x >= 3 && x < 4) {
                    System.out.println("c");
                } else {
                    if (x >= 4 && x < 5) {
                        System.out.println("d");
                    } else {
                        if (x >= 5 && x < 6) {
                            System.out.println("e");
                        } else {
                            if (x >= 6 && x < 7) {
                                System.out.println("f");
                            } else {
                                if (x >= 7 && x < 8) {
                                    System.out.println("g");
                                } else {
                                    if (x >= 8 && x < 9) {
                                        System.out.println("h");
                                    } else {
                                        if (x >= 9 && x < 10) {
                                            System.out.println("i");
                                        } else {
                                            if (x >= 10 && x < 11) {
                                                System.out.println("j");
                                            } else {
                                                if (x >= 11 && x < 12) {
                                                    System.out.println("k");
                                                } else {
                                                    System.out.println("l");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }*/

    public static void main(String[] args) {
     /*   int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        System.out.println("----for----");
// for语句
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Count is:" + numbers[i]);
        }*/
       /* int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        System.out.println("----for each----");
// for-each语句
        for (int item : numbers) {
            System.out.println("Count is:" + item);
        }*/

            String[] languages={"Java","ASP.NET","Python","C#","PHP"};
            System.out.println("现在流行的编程语言有：");

            // 使用 foreach 循环语句遍历数组
            for(String lang:languages) {
                System.out.println(lang);
            }
        }
    }

