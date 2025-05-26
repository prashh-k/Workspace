from enum import Enum

# Enum class for seasons
class Season(Enum):
    SPRING = 1
    SUMMER = 2
    FALL = 3
    WINTER = 4

# Main logic
def main():
    current_season = Season.WINTER

    # Using if-elif-else instead of match-case
    if current_season == Season.SPRING:
        print("Spring is blooming with flowers!")
    elif current_season == Season.SUMMER:
        print("Summer is hot and sunny!")
    elif current_season == Season.FALL:
        print("Fall brings beautiful autumn leaves!")
    elif current_season == Season.WINTER:
        print("Winter calls for warm clothes!")
    else:
        print("Unknown season.")

if __name__ == "__main__":
    main()
