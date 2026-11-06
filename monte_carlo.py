import random
import math
radius=50
edge=100

pi=3.1415

centerX=50
centerY=50

intCircle=0

areaSqr=edge*edge
areaCrc=pi*radius*radius

totalSim=10_000_000

for i in range(totalSim):
    rndX = random.uniform(0, 100)
    rndY = random.uniform(0, 100)

    distanceY = abs(rndY - centerY)
    distanceX = abs(rndX - centerX)
    distanceSquared=(distanceX * distanceX) + (distanceY * distanceY)
    # print(f"X:{rndX}, Y:{rndY} ---> {distance}")
    if distanceSquared <= 2500:#50*50
        intCircle+=1
print("*"*35)
print(f"Deneme sayısı: {totalSim}")
print(f"Simülasyon -> Daire/Kare: {intCircle/totalSim}")
print(f"Gerçek -> Daire/Kare: {areaCrc/areaSqr} ")
print(f"Yaklaşık bulduğumuz pi sayısı: {(intCircle/totalSim)*4}")
# Daire/Kare -> pi*r^2/4r^2 = pi/4
