# SFortress
A "Dwarf Fortress" Style Game Engine

##NOTICE:
Some revisions of this code exist only on my own portable hard drive. If you would like to see an older version, contact me at johnhoganuke2@gmail.com

## How to Use:
#To use this game engine yourself, you need:
* Tile and Icon Sprites
* Your text editor of choice
* SFortress

#Getting Started:
1. In your SFortress installation folder, find `data`.
2. Inside `data` make a new text document. Rename this to `game.json`
3. Edit the file
4. Save the file
5. Run the game engine.

#Example:
```JSON
{
  "tiles": [
    {
      "type": "solid",
      "name": "tiles.stone",
      "icon": {
        "type": "static",
        "images": ["stone"]
      },
      "hardness": 6.0,
      "drops": "items.stone",
      "meltingPoint": 2160.0,
      "fluidForm": "tiles.lava"
    },
    ...
  ]
}
```
