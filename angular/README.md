# root

1. Node Version Manager Installation

    nvm-setup.exe downloaded https://github.com/coreybutler/nvm-windows/releases and installed

    ---- Note: C:\Users\srini\AppData\Roaming\nvm got created

2. Node Installation with NVM (Node Version Manager)

    From powershell ran the command "nvm install 18.10.0"

    PS C:\Users\srini> nvm install 18.10.0
    Downloading node.js version 18.10.0 (64-bit)...
    Extracting node and npm...
    Complete
    npm v8.19.2 installed successfully.


    Installation complete. If you want to use this version, type

    nvm use 18.10.0

    ---- Note: C:\Users\srini\AppData\Roaming\nvm\v18.10.0\node_modules got created

3. Installation of Angular CLI

    npm install -g @angular/cli@16.0.0

    This threw error:
    PS C:\WINDOWS\system32> npm install -g @angular/cli@16.0.0
    npm : The term 'npm' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the
    spelling of the name, or if a path was included, verify that the path is correct and try again.
    At line:1 char:1
    + npm install -g @angular/cli@16.0.0
    + ~~~
        + CategoryInfo          : ObjectNotFound: (npm:String) [], CommandNotFoundException
        + FullyQualifiedErrorId : CommandNotFoundException

    PS C:\WINDOWS\system32>


    The NVM_SYMLINK environment variable was appened to the PATH but it was having the value C:\Program Files\nodejs

    --- Still it was throwing the following error:

    PS C:\Users\srini> npm install -g @angular/cli@16.0.0
    npm WARN deprecated @npmcli/move-file@2.0.1: This functionality has been moved to @npmcli/fs
    npm notice
    npm notice New major version of npm available! 8.19.2 -> 10.5.0
    npm notice Changelog: https://github.com/npm/cli/releases/tag/v10.5.0
    npm notice Run npm install -g npm@10.5.0 to update!
    npm notice
    npm ERR! code ECONNRESET
    npm ERR! network aborted
    npm ERR! network This is a problem related to network connectivity.
    npm ERR! network In most cases you are behind a proxy or have bad network settings.
    npm ERR! network
    npm ERR! network If you are behind a proxy, please make sure that the
    npm ERR! network 'proxy' config is set properly.  See: 'npm help config'

    npm ERR! A complete log of this run can be found in:
    npm ERR!     C:\Users\srini\AppData\Local\npm-cache\_logs\2024-03-19T01_10_11_541Z-debug-0.log
    PS C:\Users\srini>

    --- Following that notice did fail:

    PS C:\Users\srini> npm install -g npm@10.5.0
    npm ERR! code EBADENGINE
    npm ERR! engine Unsupported engine
    npm ERR! engine Not compatible with your version of node/npm: npm@10.5.0
    npm ERR! notsup Not compatible with your version of node/npm: npm@10.5.0
    npm ERR! notsup Required: {"node":"^18.17.0 || >=20.5.0"}
    npm ERR! notsup Actual:   {"npm":"8.19.2","node":"v18.10.0"}

    npm ERR! A complete log of this run can be found in:
    npm ERR!     C:\Users\srini\AppData\Local\npm-cache\_logs\2024-03-19T01_12_36_755Z-debug-0.log
    PS C:\Users\srini>


    --- Again when ran :

    PS C:\Users\srini> npm install -g @angular/cli@16.0.0
    npm WARN deprecated @npmcli/move-file@2.0.1: This functionality has been moved to @npmcli/fs

    changed 270 packages, and audited 271 packages in 41s

    38 packages are looking for funding
    run `npm fund` for details

    1 moderate severity vulnerability

    To address all issues, run:
    npm audit fix --force

    Run `npm audit` for details.
    PS C:\Users\srini>

    --- Got C:\Users\srini\AppData\Roaming\nvm\v18.10.0\node_modules\@angular

4. New angular project setup

    PS C:\_git\angular> ng new joes-robot-shop
    ng : File C:\Users\srini\AppData\Roaming\nvm\v18.10.0\ng.ps1 cannot be loaded because running scripts is disabled on
    this system. For more information, see about_Execution_Policies at https:/go.microsoft.com/fwlink/?LinkID=135170.
    At line:1 char:1
    + ng new joes-robot-shop
    + ~~
        + CategoryInfo          : SecurityError: (:) [], PSSecurityException
        + FullyQualifiedErrorId : UnauthorizedAccess
    PS C:\_git\angular>

    --- To solve the problem: 

    PS C:\_git\angular> Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy Unrestricted
    Execution Policy Change
    The execution policy helps protect you from scripts that you do not trust. Changing the execution policy might expose
    you to the security risks described in the about_Execution_Policies help topic at
    https:/go.microsoft.com/fwlink/?LinkID=135170. Do you want to change the execution policy?
    [Y] Yes  [A] Yes to All  [N] No  [L] No to All  [S] Suspend  [?] Help (default is "N"): yes
    PS C:\_git\angular>

    --- When tried again it worked!

    PS C:\_git\angular> ng new joes-robot-shop
    ? Would you like to share pseudonymous usage data about this project with the Angular Team
    at Google under Google's Privacy Policy at https://policies.google.com/privacy. For more
    details and how to change this setting, see https://angular.io/analytics. Yes

    Thank you for sharing pseudonymous usage data. Should you change your mind, the following
    command will disable this feature entirely:

        ng analytics disable --global

    Global setting: enabled
    Local setting: No local workspace configuration file.
    Effective status: enabled
    ? Would you like to add Angular routing? No
    ? Which stylesheet format would you like to use? CSS
    CREATE joes-robot-shop/angular.json (2745 bytes)
    CREATE joes-robot-shop/package.json (1046 bytes)
    CREATE joes-robot-shop/README.md (1067 bytes)
    CREATE joes-robot-shop/tsconfig.json (901 bytes)
    CREATE joes-robot-shop/.editorconfig (274 bytes)
    CREATE joes-robot-shop/.gitignore (548 bytes)
    CREATE joes-robot-shop/tsconfig.app.json (263 bytes)
    CREATE joes-robot-shop/tsconfig.spec.json (273 bytes)
    CREATE joes-robot-shop/.vscode/extensions.json (130 bytes)
    CREATE joes-robot-shop/.vscode/launch.json (470 bytes)
    CREATE joes-robot-shop/.vscode/tasks.json (938 bytes)
    CREATE joes-robot-shop/src/main.ts (214 bytes)
    CREATE joes-robot-shop/src/favicon.ico (1642 bytes)
    CREATE joes-robot-shop/src/index.html (299 bytes)
    CREATE joes-robot-shop/src/styles.css (80 bytes)
    CREATE joes-robot-shop/src/app/app.module.ts (314 bytes)
    CREATE joes-robot-shop/src/app/app.component.html (23083 bytes)
    CREATE joes-robot-shop/src/app/app.component.spec.ts (919 bytes)
    CREATE joes-robot-shop/src/app/app.component.ts (219 bytes)
    CREATE joes-robot-shop/src/app/app.component.css (0 bytes)
    CREATE joes-robot-shop/src/assets/.gitkeep (0 bytes)
    √ Packages installed successfully.
        Directory is already under version control. Skipping initialization of git.
    PS C:\_git\angular>


5. Move the one created and clone the one from git
    $ git clone https://github.com/jmcooper/joes-robot-shop.git
    Cloning into 'joes-robot-shop'...
    remote: Enumerating objects: 505, done.
    remote: Counting objects: 100% (214/214), done.
    remote: Compressing objects: 100% (51/51), done.
    remote: Total 505 (delta 179), reused 163 (delta 163), pack-reused 291
    Receiving objects: 100% (505/505), 2.14 MiB | 9.89 MiB/s, done.
    Resolving deltas: 100% (294/294), done.

    srini@DESKTOP-8SDOUPA MINGW64 /c/_git/angular (main)
    $
