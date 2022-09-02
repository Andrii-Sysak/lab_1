/**
 * Клас в якому описане поле об'єкту у вигляді масиву чисел Люка,
 * також методи, що дозволяють втрахувати числа, а також визначити за
 * останньою вказаною цифрою
 */
public class Luke {
    /**
     * Поле масиву чисел Люка, з максимальною кількістю, що визначається
     * типом Integer
     */
    private int[] luke = new int[45];

    /**
     * Метод, що обчислює числа Люка
     */
    public void createLuke() {
        luke[0] = 2;
        luke[1] = 1;
        for(int i = 2; i < luke.length; i ++)
            luke[i] = luke[i-1] + luke[i - 2];
    }

    /**
     * Метод, що виводить усі числа з діапазону N, що містять задану останню цифру
     */
    public void Nend(int N, byte _num) {
        if(N > luke.length) //якщо заданий діапазон більший за максимальну кількість, то перевіряються всі числа
            N = luke.length;
        System.out.print("Знайдені числа: ");
        for(int i = 0; i < N; i++){
            int last_num = luke[i] % 10;
            if(last_num == _num)
                System.out.print(luke[i] + " ");
        }
    }
}
