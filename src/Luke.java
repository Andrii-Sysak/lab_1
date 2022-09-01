import javax.swing.*;

public class Luke {
    private int[] luke = new int[45];

    public void createLuke() {
        luke[0] = 2;
        luke[1] = 1;
        for(int i = 2; i < luke.length; i ++)
            luke[i] = luke[i-1] + luke[i - 2];
    }
    public void getLuke() {
        for(int i = 0; i < luke.length; i ++)
            System.out.print(luke[i] + " ");
        System.out.println('\n');
    }

    public void Nend(int N, byte _num) {
        if(N > luke.length)
            N = luke.length;
        System.out.print("Знайдені числа: ");
        for(int i = 0; i < N; i++){
            int last_num = luke[i] % 10;
            if(last_num == _num)
                System.out.print(luke[i] + " ");
        }
    }
}
