import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles(() => ({
    searchButton: {
        width: '150px',
        height: '40px',
        marginRight: '15px'
    },
    midSearchContainer: {
        gridRow: '1 / 4',
        gridColumn: '4 / 8',
        display: 'flex',
        flexDirection: 'column'
    },
    searchRowContainer: {
        marginBottom: '12px'
    },
    numberField: {
        width: '100px',
        marginRight: '15px',
        // height: '40px',
    }
}));

const MidSearchContainer = _ => {
    const classes = useStyles();

    return (
    <div className={classes.midSearchContainer}>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
            <TextField
                className={classes.numberField}
                label="from"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
            <TextField
                className={classes.numberField}
                label="to"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Market Value
            </Button>
            <TextField
                className={classes.numberField}
                label="from"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
            <TextField
                className={classes.numberField}
                label="to"
                type="number"
                size="small"
                InputLabelProps={{
                    shrink: true,
                }}
                variant="outlined"
            />
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
        </div>
        <div className={classes.searchRowContainer}>
            <Button variant="contained" color="primary" className={classes.searchButton}>
                Age
            </Button>
        </div>
    </div>)
}

export default MidSearchContainer;