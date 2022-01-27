public class convertGPS {
	public static void main(String[] args) {
		String[] gridXY = { "", "" };
		
		latlonToXY(gridXY, 37.488201, 126.929810);
		System.out.println("[" + gridXY[0] + ", " + gridXY[1] + "]");
	}
	
	public static void latlonToXY(String[] gridXY, double lat, double lon) {
		//int NX = 149;			// X축 격자점 수
		//int NY = 253;			// Y축 격자점 수

		double Re = 6371.00877;		// 사용할 지구(지도)반경 [km]
		double grid = 5.0;			// 격자간격 [km]
		double slat1 = 30.0;		// 표준위도1 [degree]
		double slat2 = 60.0;		// 표준위도2 [degree]
		double olon = 126.0;		// 기준점의 경도 [degree]
		double olat = 38.0;			// 기준점의 위도 [degree]
		double xo = 210 / grid;		// 기준점 X좌표 [격자거리]
		double yo = 675 / grid;		// 기준점 Y좌표 [격자거리]
		//int first = 0;				// 시작여부 (0 = 시작)
		
		// double PI = Math.asin(1.0) * 2.0;
		double DEGRAD = Math.PI / 180.0;
		//double RADDEG = 180.0 / Math.PI;
        double re = Re / grid;
        slat1 = slat1 * DEGRAD;
        slat2 = slat2 * DEGRAD;
        olon = olon * DEGRAD;
        olat = olat * DEGRAD;

        double sn = Math.tan(Math.PI * 0.25 + slat2 * 0.5) / Math.tan(Math.PI * 0.25 + slat1 * 0.5);
        sn = Math.log(Math.cos(slat1) / Math.cos(slat2)) / Math.log(sn);
        double sf = Math.tan(Math.PI * 0.25 + slat1 * 0.5);
        sf = Math.pow(sf, sn) * Math.cos(slat1) / sn;
        double ro = Math.tan(Math.PI * 0.25 + olat * 0.5);
        ro = re * sf / Math.pow(ro, sn);
        // first = 1;
            
		double ra = Math.tan(Math.PI * 0.25 + lat * DEGRAD * 0.5);
		ra = re * sf / Math.pow(ra, sn);
		double theta = lon * DEGRAD - olon;
		if (theta > Math.PI) {
			theta -= 2.0 * Math.PI;
		}
		if (theta < -Math.PI) {
        	theta += 2.0 * Math.PI;
		}
        theta *= sn;
        double x = (double)(ra * Math.sin(theta)) + xo + 1.5;
        double y = (double)(ro - ra * Math.cos(theta)) + yo + 1.5;

        gridXY[0] = String.valueOf((int)x);
        gridXY[1] = String.valueOf((int)y);
	}
}
