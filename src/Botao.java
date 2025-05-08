//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Botao {
    public static void main(String[] args) {
 Lampada lampada = new Lampada();
 LigarLampada ligarlampada = new LigarLampada(lampada);

 ligarlampada.executar();
    }
}