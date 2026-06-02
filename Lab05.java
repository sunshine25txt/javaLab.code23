// import java.io.IOException;

// import javax.swing.JOptionPane;

void main() {//throws IOException{
    // String n = JOptionPane.showInputDialog("Enter a name:");
    // String n = Files.readString(
    //     Paths.get("Input.txt"));
    String n = IO.readln();
    int m = Integer.parseInt(n);
    // String result = "";
    // for (int i=1;i<=m;i++) {
    //     // result += " ".repeat(m-i)+"*".repeat(i)+"\n";
    //     for (int j=0;j<m-i;j++)
    //         result += " ";
    //     for (int j=0;j<i;j++) result += "*";
    //     result += "\n";
// }
    // Files.write(Paths.get("Output.txt"),
    // Arrays.asList(result));
    // JOptionPane.showMessageDialog(null,
	// 		result, "Output", 1);

    int size = 2 * m -1;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j< size; j++) {
            int min = Math.min(Math.min(i,j),Math.min(size-1-i, size-1-j));
            IO.print(m-min);
        }
        IO.println();
    }

}