$ENV{'TEXINPUTS'}='./texmf//:' . $ENV{'TEXINPUTS'};

@generated_exts = (@generated_exts, 'synctex.gz');
$out_dir='out';
