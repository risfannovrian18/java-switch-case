public class switchcase_salary {

	public static void main(String[] args) {
		int salary = 3000000;
		switch (salary) {
		case 1000500 :
			System.out.println ("Anda adalah seorang Petugas Kebersihan di PT.XYZ");
			break;
		case 3000000 :
			System.out.println ("Anda adalah seorang Karyawan di PT.XYZ");
			break;
		case 5000000 :
			System.out.println ("Anda adalah seorang Kepala Divisi di PT.XYZ");
			break;
		case 7000000 :
			System.out.println ("Anda adalah seorang Chief Manager di PT. XYZ");
			break;
		default :
			System.out.println ("Anda bukan Pegawai di PT.XYZ");
		}

	}

}
