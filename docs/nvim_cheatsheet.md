LazyVim Cheat Sheet

> Daily Java / DSA workflow

---

# 📂 Files

| Action          | Command           |
| --------------- | ----------------- |
| Open Explorer   | `Space e`         |
| Find File       | `Space Space`     |
| Open File       | `:e File.java`    |
| Create New File | `:e NewFile.java` |
| Save            | `:w`              |
| Save & Quit     | `:wq`             |

### Notes

```bash
cd ~/DSA
nvim .
```

After opening your project, you usually don't need full paths.

```vim
:e TwoSum.java
:e Arrays/TwoSum.java
```

---

# 🪟 Splits

| Action                      | Command          |
| --------------------------- | ---------------- |
| Vertical Split              | `:vsp`           |
| Horizontal Split            | `:sp`            |
| Open File in Vertical Split | `:vsp File.java` |
| Equalize Sizes              | `Ctrl+w =`       |

### Example

```vim
:vsp Solution.java
:vsp Notes.md
```

Result:

```text
| Problem.md | Solution.java | Notes.md |
```

---

# 🔄 Split Navigation

| Direction | LazyVim  |
| --------- | -------- |
| Left      | `Ctrl+h` |
| Down      | `Ctrl+j` |
| Up        | `Ctrl+k` |
| Right     | `Ctrl+l` |

---

# ✂️ Select • Copy • Paste

| Action         | Command |
| -------------- | ------- |
| Select Text    | `v`     |
| Select Lines   | `V`     |
| Select All     | `ggVG`  |
| Copy Selection | `y`     |
| Copy Line      | `yy`    |
| Paste After    | `p`     |
| Paste Before   | `P`     |

### System Clipboard

| Action            | Command   |
| ----------------- | --------- |
| Copy              | `"+y`     |
| Paste             | `"+p`     |
| Select All + Copy | `ggVG"+y` |

---

# 🗑️ Delete

| Action                | Command |
| --------------------- | ------- |
| Delete Selection      | `d`     |
| Delete Line           | `dd`    |
| Delete 5 Lines        | `5dd`   |
| Delete Word           | `dw`    |
| Delete to End of Line | `D`     |
| Select All + Delete   | `ggVGd` |

---

# ❌ Close

| Action                 | Command     |
| ---------------------- | ----------- |
| Close Split            | `:q`        |
| Force Close            | `:q!`       |
| Close Buffer           | `:bd`       |
| Close Buffer (LazyVim) | `Space b d` |
| Quit Everything        | `:qa`       |
| Force Quit Everything  | `:qa!`      |

---

# ⚡ Movement

| Action         | Command |
| -------------- | ------- |
| Top of File    | `gg`    |
| Bottom of File | `G`     |
| Start of Line  | `0`     |
| End of Line    | `$`     |
| Next Word      | `w`     |
| Previous Word  | `b`     |

---

# 🏆 Daily Workflow

```bash
cd ~/DSA
nvim .
```

```text
Space Space     → Find file
Ctrl+h/j/k/l    → Move between splits
:vsp            → New vertical split
:w              → Save
:bd             → Close file
```

# 🏆 Daily DSA Workflow

## Open Project

```bash
nvim ~/DSA
```

---

## Open Explorer

```text
Space e
```

---

## Find Problem File

```text
Space Space
```

---

## Create 3 Splits

```vim
:vsp
:vsp
```

Layout:

```text
| Problem.md | Solution.java | Notes.md |
```

---

## Navigate

```text
Ctrl+h
Ctrl+l
```

---

## Save

```vim
:w
```

---

## Save & Quit

```vim
:wq
```

---

# 🧠 Top 10 Commands To Memorize

```text
i
Esc
:vsp
Ctrl+h
Ctrl+l
yy
dd
p
ggVG
Space Space
```

Master these first. They cover most daily DSA and Java development work in Neovim.
