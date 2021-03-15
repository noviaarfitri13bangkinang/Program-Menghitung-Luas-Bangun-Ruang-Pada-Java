import java.util.Scanner;
public class proyek
{
	public static void main (String [] args)
	{
		Scanner in=new Scanner (System.in);

		System.out.println("");	
		System.out.println("			====================================			");
		System.out.println("			PROGRAM MENGHITUNG LUAS BANGUN RUANG			");
		System.out.println("			====================================			");
		System.out.println("");
	
		int swap, i, j;
		int array[] = {3,5,4,1,2};
		String
		list[]={"Persegi","Persegi Panjang","Jajar Genjang","Segi Tiga","Layang-Layang"};

			for(i=0; i<(array.length-1); i++){
				for(j=0; j<array.length-i-1; j++){
					if (array[j] > array[j+1]){
						swap = array[j];
						array[j] = array[j+1];
						array[j+1]= swap; {}
					}
				}
			}


			for(i=0; i<array.length; i++){
				System.out.println("--------------------");
				System.out.println(array[i]+". "+list[i]);
				System.out.println("--------------------");
			}

			for(;;){

		System.out.println("");
		System.out.print("Masukkan Pilihan Nomor Luas : ");
		System.out.print("");
		int pilih=in.nextInt();

		System.out.print("Pilihan Rumus Anda No : "+pilih);
		System.out.println("");

		switch (pilih){

			case 1:
			System.out.println("");
			System.out.println("Menghitung Luas Persegi");
			System.out.println("========================");
			System.out.println("");
			System.out.print("Masukkan sisi : ");
			int sisi1=in.nextInt();
			System.out.print("Masukkan sisi : ");
			int sisi2=in.nextInt();
			int hitung = sisi1*sisi2;
			System.out.println("------------------");
            System.out.println("Luas Persegi = " + hitung);
            break;

            case 2:
            System.out.println("");
			System.out.println("Menghitung Luas Persegi Panjang");
			System.out.println("================================");
			System.out.println("");
			System.out.print("Masukkan Panjang : ");
			int panjang=in.nextInt();
			System.out.print("Masukkan Lebar : ");
			int lebar=in.nextInt();
			int hitung1 = panjang*lebar;
			System.out.println("-------------------------");
            System.out.println("Luas Persegi Panjang = " + hitung1);
            break;

            case 3:
            System.out.println("");
			System.out.println("Menghitung Luas Jajar Genjang");
			System.out.println("==============================");
			System.out.println("");
			System.out.print("Masukkan Alas : ");
			double alas=in.nextInt();
			System.out.print("Masukkan Tinggi : ");
			double tinggi=in.nextInt();
			double hitung2 = alas*tinggi/2;
			System.out.println("-------------------------");
            System.out.println("Luas Jajar Genjang = " + hitung2);
            break;

            case 4:
            System.out.println("");
			System.out.println("Menghitung Luas Segi Tiga");
			System.out.println("==========================");
			System.out.println("");
			System.out.print("Masukkan Alas : ");
			double alas1=in.nextInt();
			System.out.print("Masukkan Tinggi : ");
			double tinggi1=in.nextInt();
			double hitung3 = alas1*tinggi1/2;
			System.out.println("----------------------");
            System.out.println("Luas Segi Tiga = " + hitung3);
            break;

            case 5:
            System.out.println("");
			System.out.println("Menghitung Luas Layang-Layang");
			System.out.println("==============================");
			System.out.println("");
			System.out.print("Masukkan Diagonal1 : ");
			double diagonal1=in.nextInt();
			System.out.print("Masukkan Diagonal2 : ");
			double diagonal2=in.nextInt();
			double hitung4 = diagonal1*diagonal2/2;
			System.out.println("-------------------------");
            System.out.println("Luas Layang-Layang = " + hitung4);
            break;

            default:
            System.out.println("Nomor Yang Anda Masukkan Salah");

		}

	System.out.println();
	System.out.print("Ingin Memasukkan Rumus Lagi ? (1:0) : ");
	int masuk=in.nextInt();
	System.out.println();
	if (masuk==1){
		continue;

	}else{
		System.exit(0);
	}

	}
	
}

}