Installing CivCraft can be a bit of a challenge so here are the basic steps in order.

Prereqs
==
1. You have a working MySQL server and you know how to use it.
2. You understand how to install Bukkit plugins to a minecraft server.


Install Instructions
==
1. Compile CivCraft from source. Run `mvn clean install`.

2. Put `bukkit/target/civcraft-bukkit-1.0.jar` in your plugins directory.
  - CivCraft requires TagAPI and Herochat. Install those plugins alongside it as well.
  - WorldBorder is also required.

3. Run the server once, CivCraft will fail to load but thats OK. Stop server and continue.

4. In the `<mc_server>/plugins/CivCraft` directory, modify `config.yml` to point to two SQL databases.
 - You first need a `game` database to store local server information.
 - Next you need a `global` database to store global server information.

 - The databases should be empty and upon start up, civcraft will populate and create the desired tables.
   
  - Last you need to configure their perks database for perk information. You
can use the following development perk DB information for now:
```   
    hostname: 'atlas.civcraft.net'
    port: '3306'
    database: 'civ_cake_db'
    username: 'cake'
    password: 'ddr2k0'
```
5. Copy `data/data` to `<mc_server>/plugins/CivCraft/data`

6. Copy `data/templates` to the `<mc_server>` directory.

7. Replace your server's `bukkit.jar` (or `spigot.jar`) with CivCraft's custom version (not a virus, based off of #1478): http://cl.ly/ViO7/spigot.jar

   If you fail to do this step, then creative mode will break custom civcraft items and civcraft's armor
   will be broken due to vanilla minecraft behavior.

8. Launch server, hopefully it will start without any errors.


Installing CivCraft Dynmap
==
1. Install Dynmap plugin.

2. Drop `dynmap/target/civcraft-dynmap-1.0.jar` into plugins directory.


