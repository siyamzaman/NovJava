package javac;

public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Flight [][]=new String [4][4];
		//First Row
		Flight[0][0]="Dallas";
		Flight[0][1]="NYC";
		Flight[0][2]="Miami";
		Flight[0][3]="Chicago";
		
		//Second Row
		Flight[1][0]="Los angeles";
		Flight[1][1]="seattle";
		Flight[1][2]="Washington DC";
		Flight[1][3]="Newark";
		
		// 3rd row
		Flight[2][0]="New orleans";
		Flight[2][3]="batton rougue";
		Flight[2][3]="kansas";
		Flight[2][3]="toranto";
		
		//4th row
		Flight[3][0]="Danver";
		Flight[3][1]="honolulu";
		Flight[3][2]="ancorage";
		Flight[3][3]="Houston";
		
		//System.out.println(Flight[3][3]);
		int rows= Flight.length;
		int col= Flight[0].length;
		//arument for colummguments for rows
		
		for (int rownum=0; rownum<rows;rownum++){
		
		//arg for column
		
		for (int colnum=0; colnum<col;colnum++)
		{
		System.out.println(Flight[rownum][colnum]);
		}
	}

}
}