import math

class convToXY:
    NX = 149            # X축 격자점 수
    NY = 253            # Y축 격자점 수

    Re = 6371.00877     # 사용할 지구(지도)반경 [km]
    grid = 5.0              # 격자간격 [km]
    slat1 = 30.0            # 표준위도1 [degree]
    slat2 = 60.0            # 표준위도2 [degree]
    olon = 126.0            # 기준점의 경도 [degree]
    olat = 38.0             # 기준점의 위도 [degree]
    xo = 210 / grid         # 기준점 X좌표 [격자거리]
    yo = 675 / grid         # 기준점 Y좌표 [격자거리]
    first = 0                   # 시작여부 (0 = 시작)

    # 위경도 => (X, Y)
    def latlonToXY(lat, lon):
        if convToXY.first == 0 :
            PI = math.asin(1.0) * 2.0
            DEGRAD = PI / 180.0
            RADDEG = 180.0 / PI

            re = convToXY.Re / convToXY.grid
            slat1 = convToXY.slat1 * DEGRAD
            slat2 = convToXY.slat2 * DEGRAD
            olon = convToXY.olon * DEGRAD
            olat = convToXY.olat * DEGRAD

            sn = math.tan(PI * 0.25 + slat2 * 0.5) / math.tan(PI * 0.25 + slat1 * 0.5)
            sn = math.log(math.cos(slat1) / math.cos(slat2)) / math.log(sn)
            sf = math.tan(PI * 0.25 + slat1 * 0.5)
            sf = math.pow(sf, sn) * math.cos(slat1) / sn
            ro = math.tan(PI * 0.25 + olat * 0.5)
            ro = re * sf / math.pow(ro, sn)
            convToXY.first = 1

        ra = math.tan(PI * 0.25 + lat * DEGRAD * 0.5)
        ra = re * sf / pow(ra, sn)
        theta = lon * DEGRAD - olon
        if theta > PI:
            theta -= 2.0 * PI
        if theta < -PI:
            theta += 2.0 * PI
        theta *= sn
        x = float(ra * math.sin(theta)) + convToXY.xo
        y = float(ro - ra * math.cos(theta)) + convToXY.yo
        x = int(x + 1.5)
        y = int(y + 1.5)
        return x, y

if __name__ == "__main__":
    print(convToXY.latlonToXY(37.488201, 126.929810))
