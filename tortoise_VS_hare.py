import turtle

wn = turtle.Screen()
wn.bgcolor("lightgreen")

tortoise = turtle.Turtle()
tortoise.color("green")             
tortoise.pensize(3)  
tortoise.sety(-10)  

hare = turtle.Turtle()
hare.color("white")             
hare.pensize(3)   

tortoise_speed = 1
hare_speed = 2
race_distance = 350
mins_between_naps = 30
nap_length = 30

tortoise_pos = 0
hare_pos = 0
mins_since_last_nap = 0
mins_since_nap_start = 0

while tortoise_pos < race_distance and hare_pos < race_distance:
    tortoise_pos += tortoise_speed
    tortoise.forward(tortoise_speed)
    if mins_since_last_nap <= mins_between_naps:
      hare_pos += hare_speed
      hare.forward(hare_speed)
      mins_since_last_nap += 1
    else:
      if mins_since_nap_start < nap_length:
        mins_since_nap_start += 1
      else:
        mins_since_last_nap = 0
        mins_since_nap_start = 0
    

print("Tortoise position: %d" % tortoise_pos)
print("Hare position: %d" % hare_pos)
