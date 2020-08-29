import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles(() => ({
    searchButton: {
        width: '120px',
        height: '40px',
    },
    searchContainer: {
        gridRow: '1 / 4',
        gridColumn: '1 / 13',
        display: 'flex',
        flexDirection: 'column'
    },
    searchRowContainer: {
        marginBottom: '20px'
    },
    numberField: {
        // width: '120px',
        // height: '40px',
    }

}));

const Transfer = _ => {
  const classes = useStyles();

    return (
        <div className={classes.searchContainer}>
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
        </div>
        
    )
}

export default Transfer;