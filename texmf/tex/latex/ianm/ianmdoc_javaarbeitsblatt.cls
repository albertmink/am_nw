\ProvidesClass{ianmdoc_javaarbeitsblatt}[2014/10/23]
\NeedsTeXFormat{LaTeX2e}

%*************** Variable definitions ***************

% Language variable
\def\@language{german}

% Word variables
\def\@lang@worksheet{Arbeitsblatt}
\def\@lang@exam{Klausur}
\def\@lang@timeforcompletion{Hinweis}
\def\@lang@totalscore{Gesamtpunktzahl}
\def\@lang@passingscore{Bestehensgrenze}
\def\@lang@score{Erreichte Punktzahl}
\def\@lang@turnover{BITTE WENDEN}

% Variables that determine the page geometry
\def\@topmargin{16mm}
\def\@bottommargin{25mm}
\def\@leftmargin{24mm}
\def\@rightmargin{24mm}
\def\@atbegindocument{\insertheader\par\vspace{20mm}}

% Font variable
\def\@otherfont{}

% Variables for all styles
\def\@kitlogo{kit-mono}
\def\@subject{}

% Content variables for the handout layout
\def\@course{}
\def\@pdfcourse{}
\def\@coursehomepage{http:/http://www.math.kit.edu/ianm/}
\def\@lecturers{}
\def\@pdflecturers{}

% Content variables for the worksheet layout
\def\@worksheet{}
\def\@pdfworksheet{}
\def\@sheetnumber{}
\def\@pdfsheetnumber{}
\def\@timeforcompletion{}
\def\@pdftimeforcompletion{}

% Content variables for the exam layout
\def\@exam{}
\def\@pdfexam{}
\def\@totalscore{}
\def\@passingscore{}
\def\@instructions{}
\def\@scorechart{\begin{tabular}{lp{1.5cm}p{1.5cm}lp{5cm}}
\textbf{\@lang@score}    & \hrulefill 
\end{tabular}}


%*************** Process options ***************

% Option times: Use Times New Roman font
\DeclareOption{times}{\def\@otherfont{ptm}}

% Option helvet: Use Helvetica font
\DeclareOption{helvet}{\def\@otherfont{phv}}

% Option courier: Use Courier font
\DeclareOption{courier}{\def\@otherfont{pcr}}

% Option english: Use english language 
\DeclareOption{english}{
\def\@language{english}
\def\@lang@worksheet{Worksheet}
\def\@lang@exam{Exam}
\def\@lang@timeforcompletion{Time for completion}
\def\@lang@totalscore{Total score}
\def\@lang@passingscore{Passing score}
\def\@lang@score{Score}
\def\@lang@turnover{PLEASE TURN OVER}
}

% Option handout: Page layout for a handout
\DeclareOption{handout}{%
\def\@topmargin{35mm}
\def\@bottommargin{35mm}
\def\@leftmargin{25mm}
\def\@rightmargin{25mm}
\def\@headerskip{5mm}
\def\@atbegindocument{%
\insertheader
\par\vspace{6mm}
\insertcourseheader
\vspace{1mm}
\inserthandoutheader
\par\vspace{8mm}}
}

% Option worksheet: Set page layout for a worksheet
\DeclareOption{worksheet}{%
\def\@topmargin{35mm}
\def\@bottommargin{35mm}
\def\@leftmargin{24mm}
\def\@rightmargin{24mm}
\def\@headerskip{5mm}
\def\@worksheet{\@lang@worksheet}
\def\@pdfworksheet{\@lang@worksheet}
\def\@atbegindocument{%
\insertheader
\par\vspace{6mm}
\insertcourseheader
\vspace{1mm}
\insertworksheetheader
\par\vspace{3mm}}
}


% Option exam: Set page layout for an exam
\DeclareOption{exam}{%
\def\@topmargin{35mm}
\def\@bottommargin{35mm}
\def\@leftmargin{24mm}
\def\@rightmargin{24mm}
\def\@headerskip{5mm}
\def\@worksheet{\@lang@exam}
\def\@pdfworksheet{\@lang@exam}
\def\@atbegindocument{%
\insertheader
\par\vspace{6mm}
\insertcourseheader
\vspace{1mm}
\insertexamheader
\par\vspace{3mm}}
}

\DeclareOption*{\PassOptionsToClass{\CurrentOption}{article}}
\ProcessOptions\relax


%*************** Super class definition ***************

\LoadClass[a4paper]{article}


%*************** Package requirements ***************

\RequirePackage[utf8]{inputenc}
\RequirePackage[OT1]{fontenc}
\RequirePackage[german,english]{babel}
\RequirePackage{geometry}
\RequirePackage[dvips]{graphicx}
\RequirePackage{ae}
\RequirePackage{hyperref}
\RequirePackage{ifthen}


%*************** Layout definition ***************

\ifthenelse{\equal{\@otherfont}{}}{}%
{\renewcommand{\rmdefault}{\@otherfont}}

\geometry{%
top=\@topmargin,%
bottom=\@bottommargin,%
left=\@leftmargin,%
right=\@rightmargin}

\pagestyle{empty}

\hypersetup{%
colorlinks,%
urlcolor=black,%
urlbordercolor={1 1 1},%
linkcolor=black,%
linkbordercolor={1 1 1},%
bookmarksopen=false}


%*************** Macro definitions ***************

\newcommand{\subject}[2][]{%
\def\@subject{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdfsubject{#2}}{\def\@pdfsubject{#1}}%
}

\newcommand{\course}[2][]{%
\def\@course{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdfcourse{#2}}{\def\@pdfcourse{#1}}%
}

\newcommand{\coursehomepage}[1]{%
\def\@coursehomepage{#1}%
}

\newcommand{\lecturers}[2][]{%
\def\@lecturers{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdflecturers{#2}}{\def\@pdflecturers{#1}}%
}

\newcommand{\worksheet}[2][]{%
\def\@worksheet{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdfworksheet{#2}}{\def\@pdfworksheet{#1}}%
}

\newcommand{\sheetnumber}[2][]{%
\def\@sheetnumber{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdfsheetnumber{#2}}{\def\@pdfsheetnumber{#1}}%
}

\newcommand{\timeforcompletion}[2][]{%
\def\@timeforcompletion{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdftimeforcompletion{#2}}{\def\@pdftimeforcompletion{#1}}%
}

\newcommand{\exam}[2][]{%
\def\@exam{#2}%
\ifthenelse{\equal{#1}{}}{\def\@pdfexam{#2}}{\def\@pdfexam{#1}}%
}

\newcommand{\totalscore}[1]{%
\def\@totalscore{#1}%
}

\newcommand{\passingscore}[1]{%
\def\@passingscore{#1}%
}

\newcommand{\instructions}[1]{%
\def\@instructions{#1}%
}

\newcommand{\scorechart}[1]{%
\def\@scorechart{#1}%
}

\newcommand{\insertheader}{%
\noindent\raisebox{.5pt}{\href{http://kit.edu}{%
\includegraphics[hiresbb,height=33.6pt]{\@kitlogo}}}%
\hspace{3.2mm}\rule[2.05pt]{1.0pt}{10.6mm}\hspace{3.2mm}%
\raisebox{20.44pt}{\href{http://www.math.kit.edu/ianm/}{%
\parbox[t]{55mm}{\raggedright\fontfamily{phv}\fontsize{12}{15.30pt}\selectfont%
Institut f\"ur Angewandte und\\Numerische Mathematik}}}%
\ifthenelse{\equal{\@language}{german}}{\selectlanguage{german}}{}%
\ifthenelse{\equal{\@language}{english}}{\selectlanguage{english}}{}%
}

\newcommand{\insertcourseheader}{%
\noindent\@lecturers\hfill\@date%
\par\vspace{2mm}%
\begin{center}%
\href{\@coursehomepage}{\parbox[t]{14cm}{\centering\Large\textbf\@course}}%
\end{center}%
}

\newcommand{\insertworksheetheader}{%
\begin{center}%
{\LARGE\textbf{\@worksheet~\@sheetnumber}}%
\ifthenelse{\equal{\@timeforcompletion}{}}{}{\par\vspace{2mm}\@lang@timeforcompletion:~\@timeforcompletion}%
\end{center}%
}

\newcommand{\inserthandoutheader}{%
\begin{center}\LARGE\textbf{\@title}\end{center}%
}

\newcommand{\insertexamheader}{%
\par
\begin{center}%
{\LARGE\textbf{\@exam}}%
\end{center}%
\par\vspace{8mm}\noindent%
\begin{tabular}{lp{4cm}}
\textbf{Bearbeitungszeit} & \textbf{\@timeforcompletion} \\[2mm]
\textbf{Gesamtpunktzahl}  & \textbf{\@totalscore} \\[2mm]
\multicolumn{2}{l}{\textbf{Zum Bestehen dieser Klausur m�ssen mindestens \@passingscore\ erreicht werden.}}
\end{tabular}%
\par\vspace{6mm}\noindent%
\begin{tabular}{lp{7cm}}
\multicolumn{2}{l}{Tragen Sie nachfolgend Ihren Vor- und Nachnamen, Ihr Studienfach und Ihre Matrikelnummer ein.}\\[6mm]
Vorname  & \hrulefill \\[4mm]
Nachname & \hrulefill \\[4mm]
Studienfach & \hrulefill\\[4mm]
Matrikelnummer & \hrulefill \parbox{2.5cm}{\ }
\end{tabular}%
\par\vspace{8mm}\noindent%
\@instructions%
\par\vspace{4mm}\noindent%
\@scorechart%
\newpage%
}


\newcommand{\turnover}{\hfill---~\@lang@turnover~---}


%*************** Initialize document ***************

\AtBeginDocument{\@atbegindocument}
\AtEndDocument{\hypersetup{pdftitle={\@title},pdfauthor={\@author},pdfsubject={\@subject}}}

