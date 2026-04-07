select x, y, z,
case 
    when (x+y > z) && (x+z > y) && (y+z > x)
    then "Yes"
    else "No"
    end as Triangle
from Triangle
