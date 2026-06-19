
# Neovim Basics Notes

## 1. Starting Vim (`starting`)

| Command         | Description            |
| --------------- | ---------------------- |
| `nvim file.txt` | Open a file            |
| `nvim .`        | Open current directory |
| `:help`         | Open help              |
| `:q`            | Quit                   |
| `:q!`           | Quit without saving    |
| `:w`            | Save                   |
| `:wq`           | Save and quit          |
| `ZZ`            | Save and quit          |
| `:help <topic>` | Open help topic        |

---

## 2. Editing Files (`edit-files`)

| Command          | Description           |
| ---------------- | --------------------- |
| `:e file.txt`    | Open file             |
| `:w`             | Save file             |
| `:w newfile.txt` | Save as               |
| `:q`             | Quit current window   |
| `:wq`            | Save and quit         |
| `:e!`            | Reload file from disk |

---

## 3. Movement (`motion.txt`)

### Basic Movement

| Command | Description |
| ------- | ----------- |
| `h`     | Left        |
| `j`     | Down        |
| `k`     | Up          |
| `l`     | Right       |

### Faster Movement

| Command | Description               |
| ------- | ------------------------- |
| `w`     | Next word                 |
| `b`     | Previous word             |
| `e`     | End of word               |
| `0`     | Start of line             |
| `^`     | First non-blank character |
| `$`     | End of line               |
| `gg`    | First line                |
| `G`     | Last line                 |

### Useful

| Command  | Description      |
| -------- | ---------------- |
| `%`      | Matching bracket |
| `Ctrl-o` | Jump back        |
| `Ctrl-i` | Jump forward     |

---

## 4. Scrolling (`scrolling`)

| Command  | Description    |
| -------- | -------------- |
| `Ctrl-d` | Half page down |
| `Ctrl-u` | Half page up   |
| `Ctrl-f` | Full page down |
| `Ctrl-b` | Full page up   |
| `zz`     | Center cursor  |

---

## 5. Insert Mode (`insert.txt`)

| Command | Description           |
| ------- | --------------------- |
| `i`     | Insert before cursor  |
| `a`     | Insert after cursor   |
| `I`     | Start of line       |
| `A`     | End of line           |
| `o`     | New line below        |
| `O`     | New line above        |
| `Esc`   | Return to Normal mode |

---

## 6. Change & Delete (`change.txt`)

### Delete

| Command | Description           |
| ------- | --------------------- |
| `x`     | Delete character      |
| `dd`    | Delete line           |
| `dw`    | Delete word           |
| `d$`    | Delete to end of line |

### Change

| Command | Description           |
| ------- | --------------------- |
| `cw`    | Change word           |
| `cc`    | Change line           |
| `C`     | Change to end of line |
| `r`     | Replace one character |

---

## 7. Undo / Redo (`undo-redo`)

| Command  | Description |
| -------- | ----------- |
| `u`      | Undo        |
| `Ctrl-r` | Redo        |

---

## 8. Repeat (`repeat.txt`)

| Command | Description                |
| ------- | -------------------------- |
| `.`     | Repeat last change         |
| `3dd`   | Repeat delete line 3 times |
| `5j`    | Move down 5 lines          |

Numbers before commands repeat them.

---

## 9. Visual Mode (`visual-mode`)

| Command  | Description         |
| -------- | ------------------- |
| `v`      | Character selection |
| `V`      | Line selection      |
| `Ctrl-v` | Block selection     |
| `y`      | Copy selection      |
| `d`      | Delete selection    |
| `>`      | Indent              |
| `<`      | Unindent            |

---

## 10. Various Useful Commands (`various`)

### Copy / Paste

| Command | Description  |
| ------- | ------------ |
| `yy`    | Copy line    |
| `p`     | Paste after  |
| `P`     | Paste before |

### Search

| Command | Description     |
| ------- | --------------- |
| `/word` | Search forward  |
| `?word` | Search backward |
| `n`     | Next match      |
| `N`     | Previous match  |

### Line Numbers

| Command               | Description       |
| --------------------- | ----------------- |
| `:set number`         | Show line numbers |
| `:set relativenumber` | Relative numbers  |

---

## 11. Crash Recovery (`crash-recovery`)

| Command    | Description         |
| ---------- | ------------------- |
| `:recover` | Recover file        |
| `nvim -r`  | List recovery files |

---

## Window

| Command | Description |
|---|---|
|`:split` | Open horizontal split, creates a new window below the current one.|
|`:vsplit` | Open vertical split, creates a new window beside the current one.|
|`Ctrl-w w` | Switch window, moves focus to the next open window.|


# Daily Essentials

Learn these first:

`h j k l`
`w b e`
`0 $`
`gg G`
`i a o`
`Esc`
`dd`
`yy`
`p`
`u`
`Ctrl-r`
`/search`
`n`
`:w`
`:q`
`:wq`
`.`

Master these before learning advanced motions, macros, registers, marks, buffers, tabs, and windows.
