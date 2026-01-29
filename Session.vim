let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd /mnt/Work/Projects/Data\ Structures\ and\ Algorithms
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +9 src/MainProgram.java
badd +18 src/_Arrays/GameEntry.java
badd +17 src/_Arrays/ScoreBoard.java
badd +0 term:///mnt/Work/Projects/Data\ Structures\ and\ Algorithms//392528:/usr/bin/zsh
argglobal
%argdel
edit src/_Arrays/ScoreBoard.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
wincmd _ | wincmd |
vsplit
wincmd _ | wincmd |
vsplit
3wincmd h
wincmd w
wincmd w
wincmd w
wincmd _ | wincmd |
split
1wincmd k
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 30 + 118) / 236)
exe 'vert 2resize ' . ((&columns * 87 + 118) / 236)
exe 'vert 3resize ' . ((&columns * 58 + 118) / 236)
exe '4resize ' . ((&lines * 25 + 27) / 54)
exe 'vert 4resize ' . ((&columns * 58 + 118) / 236)
exe '5resize ' . ((&lines * 25 + 27) / 54)
exe 'vert 5resize ' . ((&columns * 58 + 118) / 236)
argglobal
enew
file NvimTree_1
balt src/_Arrays/ScoreBoard.java
setlocal foldmethod=manual
setlocal foldexpr=0
setlocal foldmarker={{{,}}}
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal nofoldenable
wincmd w
argglobal
balt src/_Arrays/GameEntry.java
setlocal foldmethod=manual
setlocal foldexpr=0
setlocal foldmarker={{{,}}}
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal foldenable
silent! normal! zE
let &fdl = &fdl
let s:l = 29 - ((28 * winheight(0) + 25) / 51)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 29
normal! 0
wincmd w
argglobal
if bufexists(fnamemodify("src/_Arrays/GameEntry.java", ":p")) | buffer src/_Arrays/GameEntry.java | else | edit src/_Arrays/GameEntry.java | endif
if &buftype ==# 'terminal'
  silent file src/_Arrays/GameEntry.java
endif
balt src/MainProgram.java
setlocal foldmethod=manual
setlocal foldexpr=0
setlocal foldmarker={{{,}}}
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal foldenable
silent! normal! zE
let &fdl = &fdl
let s:l = 19 - ((18 * winheight(0) + 25) / 51)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 19
normal! 017|
wincmd w
argglobal
if bufexists(fnamemodify("src/MainProgram.java", ":p")) | buffer src/MainProgram.java | else | edit src/MainProgram.java | endif
if &buftype ==# 'terminal'
  silent file src/MainProgram.java
endif
balt src/_Arrays/GameEntry.java
setlocal foldmethod=manual
setlocal foldexpr=0
setlocal foldmarker={{{,}}}
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal foldenable
silent! normal! zE
let &fdl = &fdl
let s:l = 8 - ((7 * winheight(0) + 12) / 25)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 8
normal! 044|
wincmd w
argglobal
if bufexists(fnamemodify("term:///mnt/Work/Projects/Data\ Structures\ and\ Algorithms//392528:/usr/bin/zsh", ":p")) | buffer term:///mnt/Work/Projects/Data\ Structures\ and\ Algorithms//392528:/usr/bin/zsh | else | edit term:///mnt/Work/Projects/Data\ Structures\ and\ Algorithms//392528:/usr/bin/zsh | endif
if &buftype ==# 'terminal'
  silent file term:///mnt/Work/Projects/Data\ Structures\ and\ Algorithms//392528:/usr/bin/zsh
endif
balt src/MainProgram.java
setlocal foldmethod=manual
setlocal foldexpr=0
setlocal foldmarker={{{,}}}
setlocal foldignore=#
setlocal foldlevel=0
setlocal foldminlines=1
setlocal foldnestmax=20
setlocal foldenable
let s:l = 125 - ((24 * winheight(0) + 12) / 25)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 125
normal! 014|
wincmd w
2wincmd w
exe 'vert 1resize ' . ((&columns * 30 + 118) / 236)
exe 'vert 2resize ' . ((&columns * 87 + 118) / 236)
exe 'vert 3resize ' . ((&columns * 58 + 118) / 236)
exe '4resize ' . ((&lines * 25 + 27) / 54)
exe 'vert 4resize ' . ((&columns * 58 + 118) / 236)
exe '5resize ' . ((&lines * 25 + 27) / 54)
exe 'vert 5resize ' . ((&columns * 58 + 118) / 236)
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let &winminheight = s:save_winminheight
let &winminwidth = s:save_winminwidth
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
