import javax.swing.*;  
import java.awt.*;  

public class DrawShapes extends JPanel {  
    Font font;  
    Color redColor;  
    Color blueColor;  
    Color backgroundColor;  

    public DrawShapes() {  
        // Mengatur font Arial ukuran 18 dengan style Italic  
        font = new Font("Arial", Font.ITALIC, 18);  

        // Warna yang telah didefinisikan dalam kelas Color  
        redColor = Color.red;  
        backgroundColor = Color.orange;  

        // Warna custom menggunakan RGB (0,0,122) untuk biru tua  
        blueColor = new Color(0, 0, 122);  

        // Mengatur warna latar belakang  
        setBackground(backgroundColor);  
    }  

    @Override  
    protected void paintComponent(Graphics graph) {  
        super.paintComponent(graph);  

        // Mengatur font  
        graph.setFont(font);  

        // Membuat judul  
        graph.drawString("Draw Shapes", 90, 20);  

        // Mengatur warna untuk bentuk pertama (biru tua)  
        graph.setColor(blueColor);  

        // Menggambar persegi panjang di koordinat (120,120) dengan ukuran 120x120  
        graph.drawRect(120, 120, 120, 120);  

        // Mengisi warna dalam persegi panjang  
        graph.fillRect(115, 115, 90, 90);  

        // Mengatur warna untuk bentuk berikutnya (merah)  
        graph.setColor(redColor);  

        // Menggambar lingkaran dengan menggunakan drawArc  
        graph.fillArc(110, 110, 50, 50, 0, 360);  

        // Mengatur warna untuk bentuk selanjutnya (cyan)  
        graph.setColor(Color.CYAN);  

        // Menggambar persegi panjang lainnya  
        graph.drawRect(50, 50, 50, 50);  

        // Mengisi warna dalam persegi panjang  
        graph.fillRect(50, 50, 60, 60);  
    }  

    public static void main(String[] args) {  
        JFrame frame = new JFrame("Draw Shapes");  
        DrawShapes panel = new DrawShapes();  

        frame.add(panel);  
        frame.setSize(400, 400);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
